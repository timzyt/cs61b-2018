public class Planet {
	public double x;
	public double y;
	public double xVelocity;
	public double yVelocity;
	public double xNetForce = 0;
	public double yNetForce = 0;
	public double netForce = 0;
	public double xAccel;
	public double yAccel;
	public double mass;
	public String img;
	public Planet(double xPosition, double yPosition, double xDirectionVelocity, double yDirectionVelocity, double weight, String image){
		x = xPosition;
		y = yPosition;
		xVelocity = xDirectionVelocity;
		yVelocity = yDirectionVelocity;
		mass = weight;
		img = image;
	}
	
	public double calcDistance(Planet p) {
		double r = Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
		return r;
	}
	
	public double calcPairwiseForce(Planet p) {
		double gConstant = 6.67 * Math.pow(10,-11);
		double force = gConstant * mass * p.mass / (this.calcDistance(p) * this.calcDistance(p));
		return force;
	}
	
	public double calcPairwiseForceX(Planet p) {
		double pairwiseForceX = this.calcPairwiseForce(p) * (p.x - this.x) / this.calcDistance(p);
		return pairwiseForceX;
	}
	
	public double calcPairwiseForceY(Planet p) {
		double pairwiseForceY = this.calcPairwiseForce(p) * (p.y - this.y) / this.calcDistance(p);
		return pairwiseForceY;
	}
	
	public void setNetForce(Planet[] planets) {
		int i = 0;
		int len = planets.length;
		while (i < len) {
			if ( this == planets[i]) {
				continue;
			} else {
				xNetForce += this.calcPairwiseForceX(planets[i]);
				yNetForce += this.calcPairwiseForceY(planets[i]);
			}
			i += 1;
		}
		netForce = Math.sqrt(xNetForce * xNetForce + yNetForce * yNetForce);
	}
	
	public void draw() {
		StdDraw.setXscale(-2 * this.x, 2 * this.x);
		StdDraw.setYscale(-2 * this.y, 2 * this.y);
		StdDraw.line(-2 * this.x, 0, 2 * this.x, 0);
		StdDraw.line(0 , -2 * this.y, 0, 2 * this.y);
		StdDraw.setPenRadius(0.01);
		StdDraw.point(this.x,this.y);
	}
	
	public void update(double dt) {
		this.xAccel = xNetForce / this.mass;
		this.yAccel = yNetForce / this.mass;
		this.xVelocity += dt * xAccel;
		this.yVelocity += dt * yAccel;
		this.x += dt * this.xVelocity;
		this.y += dt * this.yVelocity;
	}
}

