///Student : Gershom Raymundo
///squids and boats project

float horizon;
float r, g, b;
float sX, sY;
float counter;

Squid mySquid1;
Squid mySquid2;
Squid mySquid3;

Boat[] boat = new Boat[5];

//setup the screen
void setup(){
  size( 800, 800 );
  horizon = height / 3;
  
  mySquid1 = new Squid( 255, 56, 113, width / 2 ,height, 2 );
  mySquid2 = new Squid( 57, 61, 255, width / 3, height, 3);
  mySquid3 = new Squid( 60, 232, 52, width / 4, height, 1.5); 
  
  
  //array of boats
  for(int i = 0; i < boat.length; i++){
  boat[i] = new Boat( width - 70, horizon - 50, 2);
  }
}

//void reset(){
//}

void draw(){
  scene();
  mySquid1.display();
  mySquid1.move();
  mySquid2.display();
  mySquid2.move();
  mySquid3.display();
  mySquid3.move();
  
  for(int i = 0; i < boat.length; i++){
  boat[i].display();
  boat[i].move();
  }
}

void scene(){
  background( 25, 206, 74 );
  fill( 25, 177, 206);
  rect( 0, horizon, width, height); 
}



//void messages(){
//}

//keypresses
//void keyPressed(){
//}




class Boat{
  float dx,dy,speed;
  
  Boat (float tempDX, float tempDY,float tempSpeed){
    dx = tempDX;
    dy = tempDY;
    speed = tempSpeed;
  }

  void display(){
    stroke(0);
    fill( 95, 68, 12);
    rect( dx,dy, 80, 50);
  }

  void move(){
    dx -= speed; 
    if(dx == 0){
    speed = speed * -1;
    }
    else if( dx == width){
     speed = speed * -1;
    }
  }
}



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
