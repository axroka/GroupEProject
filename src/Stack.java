class UserAction {
    private String action;
    private String detail;

    public UserAction(String action, String detail) {
        this.action = action;
        this.detail = detail;
    }

    public String getAction() {
        return action;
    }

    public String getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return action + ": " + detail;
    }
}