public class Machine {

    private String name = "";
    private int oil = 0;
    private boolean outOfOrder = false;
    public String text = "";

    public Machine(String name, int oil) {
        this.name = name;
        this.oil = oil;
    }


    public String work(int details) {
        int o = this.oil - details;
        if (o <= 0) {
            outOfOrder = true;
        }

        if (outOfOrder == false) {
            text = "Keep working";
        } else {
            text = "I am out of order";
        }
        return text;

    }

}

