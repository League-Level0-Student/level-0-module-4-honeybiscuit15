PImage donkey;
PImage tail; 
void setup() {
donkey = loadImage("fluffy.jpg");     
tail = loadImage("DonkeyTail.png"); 
tail.resize(118,240);
size(700,700 );  
}void draw(){
  if(mouseX>=0&&mouseX<=30&&mouseY>=0&&mouseY<=30){
  background(donkey);
}else{
background(0,0,0);
}
if(mousePressed){
  background(donkey);

}
 rect(0, 0, 30, 30); 
rect(480, 260, 40, 40); 
  image(tail, mouseX-80, mouseY-10);
  }