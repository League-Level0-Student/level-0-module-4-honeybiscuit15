PImage creeper; 
int creeperX=100;
int creeperY=100;
void setup(){
  noStroke();
  size(700,700); 
PImage minecraft = loadImage("minecraftforest.jpg"); 
minecraft.resize(700, 700);    
background(minecraft);    
 //at the top
creeper=loadImage("creeper.jpg");     //in setup method
creeper.resize(50, 50);     //in setup method
image(creeper, creeperX, creeperY);     //in draw method
}
void draw(){
if(mousePressed){
fill(255,0,0);
if(mouseX>creeperX&&mouseX<creeperX+creeper.width&&mouseY>creeperY&&mouseY<creeperY+creeper.height){
fill(0,128,0);
}  ellipse(mouseX, mouseY, 25, 25);
}    

  }
    /*
4. Load the creeper image into your sketch
     i) Download this Creeper to your desktop
     ii) Drop the image onto your sketch
     iii) Use the code below to draw the image (make sure you put it in the right place)
PImage creeper;     //at the top
creeper=loadImage("creeper.png");     //in setup method
image(creeper, mouseX, mouseY);     //in draw method
5. Resize the creeper image so that it is small and can hide, right after it’s loaded.
creeper.resize(width, height);     //in setup method
6. Pick a place to hide your creeper.
     i) Use two variables to store the location (x and y) of the creeper, and initialize them (at the top of your sketch).
     ii) Change your code so that the creeper image is drawn at this location.
7. In the draw method, draw a small red ellipse where the mouse clicks.
8.When mouseX and mouseY are the top left corner, draw a green ellipse instead of a red one.
9. If mouseX and mouseY are near the location of your creeper, make the circle green.
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
/*/