PImage donkey;
PImage tail; 
int tailX=0;
int tailY=0;
void setup() {
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
    tailX=mouseX-80;
    tailY=mouseY-10;
  } 
    if (tailX>=480&&tailX<=40&&tailY>=260&&tailY<=40) {
  
      
  } 
  rect(0, 0, 30, 30); 
  rect(480, 260, 40, 40); 
  if(tailX>0){
    image(tail,tailX,tailY);
  }
 else{
  image(tail, mouseX-80, mouseY-10);
}
}