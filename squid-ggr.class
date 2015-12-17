class Squid {
  float r, g, b;
 private float xpos;
 private float ypos;
  float speed;
  
  Squid( float tempR, float tempG, float tempB, float tempXpos, float tempYpos, float tempspeed){
    r = tempR;
    g = tempG;
    b = tempB;
    xpos = tempXpos;
    ypos = tempYpos;
    speed = tempspeed;
    
  }
  
  void display(){
    stroke(0);
    fill( r, g, b);
    ellipse( xpos, ypos, 60,60);
  }

void move(){
  ypos -= speed;
  if(ypos == horizon){
    speed = speed * -1;
    }
    else if( ypos == height){
     speed = speed * -1;
    } 
  
  }
}
