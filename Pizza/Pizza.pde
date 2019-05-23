import ddf.minim.*; //at the top of the sketch
Minim minim; //at the top of the sketch
AudioPlayer sound; //at the top of the sketch
void setup() {
  size(500,500);
  minim = new Minim(this); //in the setup method
  sound = minim.loadFile("sound.wav");
}

void draw(){
fill(255,255,0);
ellipse(250,250,400,400);
PImage pepperoni = loadImage("pepperoni.gif");
pepperoni.resize(100,100);
image(pepperoni,300,250);
sound.play();
sound.rewind();
PImage cheese = loadImage("cheese.png");
image(cheese, 100, 100);
}
