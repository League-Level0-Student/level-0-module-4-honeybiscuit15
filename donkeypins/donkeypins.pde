PImage donkey;
PImage tail; 
int tailX=0;
int tailY=0;
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

void setup() {
  Minim minim = new Minim(this);     //In the setup method
  woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
  donkey = loadImage("fluffy.jpg");     
  tail = loadImage("DonkeyTail.png"); 
  tail.resize(118, 240);
  size(700, 700 );
}
void draw() {

  if (mouseX>=0&&mouseX<=30&&mouseY>=0&&mouseY<=30) {
    background(donkey);
  } else {
    if (tailX>0) {
      background(donkey);
    } else {
      background(0, 0, 0);
    }
  }
  if (mousePressed&&tailX==0) {
    background(donkey);
    tailX=mouseX;
    tailY=mouseY;
    println(tailX);  
    println(tailY);
  } 
  if (tailX>=480   &&   tailX<=(480+40)   &&   tailY>=260   &&   tailY<=(260+40)) {
    if (playSound) {
      woohooSound.trigger();
      playSound = false;
    }
    println("hi");
  } 
  rect(0, 0, 30, 30); 
  //  rect(480, 260, 40, 40); 
  if (tailX>0) {
    image(tail, tailX-80, tailY-10);
  } else {
    image(tail, mouseX-80, mouseY-10);
  }
}