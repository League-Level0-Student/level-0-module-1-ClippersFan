void setup(){
  size(500,500);
}
void draw(){
  PImage face = loadImage("face.jpeg");
  image(face,0,0);
  face.resize(100,100);
  ellipse(75,108,50,50);
  ellipse(125,108,50,50);
  fill(mouseX,0,mouseY);
}
