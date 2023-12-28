package homework;

class car {
    private int displacement;
    private int weight;
    private String color;
    private String maker;
    private String name;

    public car(int displacement, int weight, String color, String maker, String name) {
        this.displacement = displacement;
        this.weight = weight;
        this.color = color;
        this.maker = maker;
    }

    public void drive() {
        System.out.println("드라이브");
    }

    public void brake() {
        System.out.println("브레이크");
    }

    public void handle() {
        System.out.println("핸들");
    }
    
    public void engine() {
    	System.out.println("엔진");
    }
}

