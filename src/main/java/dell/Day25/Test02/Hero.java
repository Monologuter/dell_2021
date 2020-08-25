package dell.Day25.Test02;

 abstract class Hero {

     String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     void attack() {
        System.out.println("我是一个抽象类");
    }

 }
