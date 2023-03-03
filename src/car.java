class car extends vehicale{
    int number_of_wheels=4;
    String type="craola";
    int number_of_doors=4;
    int gear=0;
    int ismanual;


    public void change_gear(int gear){
        System.out.println("the car is now" +gear+ "th gear");
    }
    public void iscarmanual(int ismanual){
        this.ismanual=ismanual;
        if (ismanual==1){
            System.out.println("the car is manual");
        } else if (ismanual==0) {
            System.out.println("the car is automatic");
        }

    }

    @Override
    public void move(int speed, int direction) {
        System.out.println("move the car with"+ speed+ "speed in " +direction+ "angle" );
    }

    @Override
    public void steer(int direction) {
        System.out.println("move the steer with" +direction +"angle");
    }
}
