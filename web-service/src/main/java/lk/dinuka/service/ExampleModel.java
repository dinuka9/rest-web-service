package lk.dinuka.service;

/**
 * Created by dinuka on 7/24/17.
 */
public class ExampleModel {
    private String body;
    private int id;

    public ExampleModel() {
    }

    public ExampleModel(String body, int id) {
        this.body = body;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ExampleModel{body='" + body + "\', id=" + id + "}";
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
