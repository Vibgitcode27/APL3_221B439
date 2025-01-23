    public static void main(String[] args) {
        // Creating an object of Mother
        Mother m = new Mother();
        m.show();  // This will call the show() method of Mother

        // Creating an object of Child
        Child ch = new Child();
        ch.show();  // This will call the inherited show() method of Mother (since Child doesn't override it)
    }