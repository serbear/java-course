 abstract class CheckCommand implements ICheckCommand  {
     String message;
    public CheckCommand(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
