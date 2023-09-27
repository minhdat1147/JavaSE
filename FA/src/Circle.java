public class Circle {
        private double radius;
        public Circle() {
            this.radius = 1.0;
        }
        public Circle(double radius){
            super();
            this.radius = radius;
        }
        public double getRadius(){
            return radius;
        }
        public double getArea(){
            return Math.PI * Math.pow(radius,2);
        }
}
