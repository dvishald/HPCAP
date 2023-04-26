#include <iostream>
using namespace std;


class Shape{
  protected :
 float  radius;
 float pi=3.143;
 float height;
 
 public:
  
  Shape() 
{
	cout<<"Enter Radius"<<endl;
	cin>>radius;
	
	cout<<"Enter Height"<<endl;
	cin>>height;
	
	
} 
};

class Sphere :public Shape
{

	public:
	 float areaOfSphare()
	{
		float area= 4*pi*(radius*radius);
	Area of Cube: 24
Volume of cube 8
	return area;
	
	}
	
	
	 float volumeOfSphare()
	{
		float volume = 4/3*pi*radius*radius*radius ;
                    	return volume;
	
	}
};


class Cylinder :public Shape
{

	public:
	 float areaOfCylinder()
	{
		float area= 2*(pi*radius*height)+2*(pi*radius*radius);
		return area;
	
	}
	
	
	 float volumeOfCylinder()
	{
		float volume = pi*height*radius*radius ;
                    	return volume;
	
	}
};

class Cube :public Shape
{

	public:
	 float areaOfCube()
	{
		float area= (height*height)*6;
		return area;
	
	}
	
	
	 float volumeOfCube()
	{
		float volume = (height*height)*height;
                    	return volume;
	
	}
};


int main()
{

	/*Sphere sp;
	
	sp.initaialize();
	Cylinder cy;
	cy.initaialize();
	
	cout<<"Area Of Cylinder is : "<<cy.areaOfCylinder()<<endl;
	cout<<"volume Of Cylinder is : "<<cy.volumeOfCylinder()<<endl;
	
	cout<<"Area of Sphere"<<sp.areaOfSphare()<<endl;
	
	cout<<"Volume of Sphere"<<sp.volumeOfSphare()<<endl;
	*/
	
	Cube cb;
	cout<<  "Area of Cube: "<<cb.areaOfCube()<<endl;
	cout<<"Volume of cube "<<cb.volumeOfCube()<<endl;
}




