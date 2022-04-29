package pe.isil.user;


import pe.isil.red.IRed;


public class Charly {
	private IRed red;
	public Charly() {
    }

    public Charly(IRed red) {
        this.red = red;
       
    }

	
	public void setRed(IRed red) {
		this.red = red;
	}

	public void showRedName(){
        red.getName();
    }

    

	

}
