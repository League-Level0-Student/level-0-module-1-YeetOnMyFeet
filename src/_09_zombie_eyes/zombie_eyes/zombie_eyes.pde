
void setup() {
PImage zombie = loadImage("zombie.png");
image(zombie, 0 ,0);
size(200, 350);
zombie.resize(200, 350);
}
void draw() {
ellipse(55, 82, 40, 40);
fill(#FF0303);
ellipse(135, 80 , 40 ,40);
fill(#FF0303);
ellipse(55,82,0, 0);
fill(#050505);
ellipse(135,82, 0, 0);
fill(#050505);
}
