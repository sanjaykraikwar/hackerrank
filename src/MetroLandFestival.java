
public class MetroLandFestival {
	
	public static void main(String ar[]) {
		
		int p[]={1,1};
		int x[]={1,3};
		int y[]={1,1};
		
		System.out.println(cost(p,x,y));
	}
	
	
	static  int cost(int p[],int x[],int y[]) {
	
	int sumx;
    int sumy;
    int minx=Integer.MAX_VALUE;
    int miny=Integer.MAX_VALUE;
    for(int i=0;i<x.length;i++){
        sumx=0;
        sumy=0;
        for(int j=0;j<x.length;j++){
            sumx+=(Math.abs(x[i]-x[j]))*p[j];
            sumy+=(Math.abs(y[i]-y[j]))*p[j];
        }
        if(sumx<minx){
            minx=sumx;
        }
        if(sumy<miny){
            miny=sumy;
        }
    }
    
    return minx+miny; 
	}

}


