class Receipt {
    private String action;
    private String info;

    public Receipt(String action, String detail) {
        this.action = action;
        this.info = detail;
    }

    public String getAction() {
        return action;
    }

    public String getinfo() {
        return info;
    }

    @Override
    public String toString() {
        return action + ": " + info;
    }
}