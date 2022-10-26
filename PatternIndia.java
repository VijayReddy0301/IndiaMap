
public class PatternIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=80;
		for(int i=2;i<=48;i++) {
			
			for(int j=0;j<m;j++) {
				
				if( (i==2 && j>20 && j<=26) || (i==3 && j>20 && j<=30) || (i==4 && j>21 && j<=36
						
						|| (i==5 && j>23 && j<=37) || (i==6 && j>21 && j<=36)
						
						|| (i==7 && j>22 && j<=34) || (i==8 && j>22 && j<=34)
						
						|| (i==9 && j>24 && j<=37) || (i==10 && j>24 && j<=33)
						
						|| (i==11 && j>24 && j<=35) || (i==12 && j>23 && j<=37)
						
						|| (i==13 && j>21 && j<=37) || (i==14 && j>20 && j<=36 )||(i==14 && j>71 && j<=76 )
						
						|| (i==15 && j>19 && j<=37) ||(i==15 && j>69 && j<=80 )
						
						|| (i==16 && j>18 && j<=40) ||(i==16 &&  j==58 ) ||(i==16 && j>67 && j<=78 )
						
						|| (i==17 && j>13 && j<=43) ||(i==17 &&  j>=58 && j<=59 ) ||(i==17 && j>64 && j<=77 )
						
						|| (i==18 && j>11 && j<=48) ||(i==18 &&  j>=58 && j<=59 ) ||(i==18 && j>65 && j<=74 )
						
						|| (i==19 && j>12 && j<=75)
						
						|| (i==20 && j>13 && j<=60) ||(i==20 &&  j>61 && j<=74 ) 
						
						|| (i==21 && j>14 && j<=59) ||(i==21 &&  j>61 && j<=74 ) 
						
						|| (i==22 && j>4 && j<=13) ||(i==22 &&  j>14 && j<=59 ) ||(i==22 && j>68 && j<=74 )
						
						|| (i==23 && j>2 && j<=61) ||(i==23 && j>68 && j<=73 )
						
						|| (i==24 && j>7 && j<=60) ||(i==24 && j>67 && j<=73 )
						
						|| (i==25 && j>4 && j<=63) ||(i==25  && j==73 )
						
						|| (i==26 && j>4 && j<=63) ||(i==26  && j==73 )
						
						|| (i==27 && j>7 && j<=16) ||(i==27  && j>=19 && j<=58 )
						
						|| (i==28 && j>8 && j<=16) ||(i==28  && j>=19 && j<=56 )
						
						|| (i==29  && j>=20 && j<=55)
						
						|| (i==30  && j>=19 && j<=54)
						
						|| (i==31  && j>=20 && j<=50)
						
						|| (i==32  && j>=20 && j<=50)
						
						|| (i==33  && j>=20 && j<=48)
						
						|| (i==34  && j>=20 && j<=46)
						
						|| (i==35  && j>=20 && j<=45)
						
						|| (i==36  && j>=21 && j<=45)
						
						|| (i==37  && j>=22 && j<=42)
						
						|| (i==38  && j>=23 && j<=43)
						
						|| (i==39  && j>=23 && j<=42)
						
						|| (i==40  && j>=24 && j<=42)
						
						|| (i==41  && j>=25 && j<=41)
						
						|| (i==42  && j>=25 && j<=41)
						
						|| (i==43  && j>=27 && j<=39)
						
						|| (i==44  && j>=27 && j<=39)
						
						|| (i==45  && j>=30 && j<=37)
						
						|| (i==46  && j>=30 && j<=35)
						
						|| (i==47  && j>=31 && j<=34)
						
						)    ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			
			    System.out.println();
		}
		
		int n=5;
		for(int i=0;i<n;i++) {
			
			 System.out.print("                  ");
			
           // Letter I
			
			for(int j=0;j<n;j++) {
				
				if(j==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			// Letter N
			for(int j=0;j<n;j++) {
				
				if((j==0) || (i==j) || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			 System.out.print("  "); // this is for space between two letters
			
			//Letter D
			for(int j=0;j<n;j++) {
				
				if((i==0 && j<n-1) || (j==0) || (j==n-1 && i>0 && i<n-1) || (i==n-1 &&  j<n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			// System.out.print("  "); // this is for space between two letters
			// Letter I
			
			for(int j=0;j<n;j++) {
				
				if(j==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			// Letter A
			for(int j=0;j<n;j++) {
				
				if((i==0 && j>0 && j<n-1) || (j==0 && i>0) || (j==n-1 && i>0) || i==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}


		
		
		
		
		

	}

}
