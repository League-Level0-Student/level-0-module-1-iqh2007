void setup() {
  size(500,500);
}
void draw()  {
    background(255, 255, 255);
    noStroke();
    fill(#E51332);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#0C9020);
    rect(176, 103, 12, 32); 
    if(mousePressed){
    fill(#FFFFFF);
    ellipse(80, 200, 40, 40);
    }
    }