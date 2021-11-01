
public class Rectangle {

    protected float width;
    protected float height;
    Rectangle(float width, float height) {
        this.width = width; this.height = height;
    }
    public float computeArea() {
        return this.width * this.height;
    }
    public float GetWidth() { return this.width; }
    public float GetHeight() { return this.height;  }
    public void SetWidth(float width) { this.width = width; }
    public void SetHeight(float height) { this.height = height; }

}

