void setup() {

PImage donkey;
PImage tail; 
donkey = loadImage("fluffy.jpg");     
tail = loadImage("DonkeyTail.png"); 
tail.resize(118,240);
size(700,700 );  
background (donkey);
image(tail, mouseX, mouseY);
rect(0, 0, 30, 30); 

    
}