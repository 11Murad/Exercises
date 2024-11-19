public abstract class Duck {
        public String name;

        Duck(String name) {
            this.name = name;
        }

        void swim() {
            System.out.println("Swimming...");
        }

        public void  display(){
            System.out.println(this.name);
        }
}
