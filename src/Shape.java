
public interface Shape {
    float computeArea();
}

class Square implements Shape {
    float width;
    Square(float width) {this.width=width;}
    public float GetWidth() { return this.width;  }
    public void SetWidth(float width) { this.width = width; }
    public float computeArea() {return this.width * this.width;}
}

class Rectangle implements Shape {
    float height;
    float width;
    Rectangle(float width, float height) {this.width = width; this.height = height;}
    public float GetWidth() { return this.width; }
    public float GetHeight() { return this.height;  }
    public void SetWidth(float width) { this.width = width; }
    public void SetHeight(float height) { this.height = height; }
    public float computeArea() {return this.width * this.height;}
}

