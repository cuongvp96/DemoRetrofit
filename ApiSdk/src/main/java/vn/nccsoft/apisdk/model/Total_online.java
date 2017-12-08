package vn.nccsoft.apisdk.model;

/**
 * Created by vancu on 07/12/2017.
 */

public class Total_online {
    private int id;
    private String time;
    private int amount_user;
    private int game_id;

    public Total_online(int amount_user, int game_id) {
        this.amount_user = amount_user;
        this.game_id = game_id;
    }

    public Total_online(int id, String time, int amount_user, int game_id) {
        this.id = id;
        this.time = time;
        this.amount_user = amount_user;
        this.game_id = game_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAmount_user() {
        return amount_user;
    }

    public void setAmount_user(int amount_user) {
        this.amount_user = amount_user;
    }

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public Total_online() {
    }
}
