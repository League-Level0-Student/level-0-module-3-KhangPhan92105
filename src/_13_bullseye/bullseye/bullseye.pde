void setup() {
  
  //set the size of your sketch
  size(600,600);
}

void draw() {
  for(int i= 8; i>0; i--) {
    if( i % 2 ==0){
      fill(200,200,200);
    } else{
      fill(0,0,0);
    }
   
    ellipse(300,300, i*50, i*50);
    
    
  }
  
  
  
}
