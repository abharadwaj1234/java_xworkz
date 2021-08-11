class PrimeNumbersDemo{

	upublic static void main(String[] args) 
	{
		int i, j, count; 
		
		System.out.println(" Prime Numbers from 1 to 50 are : ");	
		for(i = 1; i <= 50; i++)
		{
			count = 0;
		    for (j = 2; j <= i/2; i++)
		    {
		    	if(i % j == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && i!= 1 )
		    {
		    	System.out.print(i+ " ");
		    }  
		}
	}
}