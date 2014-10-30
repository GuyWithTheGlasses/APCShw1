public class CodingBat{

    /*------------- HW 14b Problems --------------*/
    
    public int sum67(int[] nums) {
	int sum = 0;
	
	for(int i = 0 ; i < nums.length ; i++){
	    
	    if(nums[i] == 6){
		
		for( ; i < nums.length ; i++){
		    
		    if(nums[i] == 7){
			i++;
			break;
		    }

		}

	    }

	    if(i < nums.length){
		sum = sum + nums[i];
	    }
	}
    
	return sum;
    }

    public boolean more14(int[] nums) {
	int ones = 0;
	int fours = 0;
	
	for(int i = 0 ; i < nums.length ; i++){
	    
	    if(nums[i] == 1){
		ones++;
	    }
	    if(nums[i] == 4){
		fours++;
	    }
	    
	}
	
	if(ones > fours){
	    return true;
	}
	
	else{
	    return false;
	}
	
	public int[] tenRun(int[] nums){
	    boolean running = false;
	    int mul10 = 0;
	    
	    for(int i = 0 ; i < nums.length ; i++){
		
		if((nums[i] % 10) == 0){
		    running = true;
		    mul10 = nums[i];
		}
		if(running){
		    nums[i] = mul10;
		}
		
	    }
	    
	    return nums;
	}
		

	public boolean tripleUp(int[] nums) {
	    boolean yeshno = false;
	    
	    for(int i = 0 ; i+2 < nums.length ; i++){
		if(nums[i] + 1 == nums[i + 1] 
		   && nums[i + 1] + 1 == nums[i + 2]) {
		    yeshno = true;
		}
	    }
	    
	    return yeshno;
	}

	/*------------- Harder HW Problems --------------*/
		    
	public boolean canBalance(int[] nums) {
	    int[] split = new int[nums.length];
	    boolean yeshno = false;
  
	    int sum1 = 0;
	    int sum2 = 0;
	    
	    for(int n = 0 ; n < nums.length ; n++){
		sum2 = sum2 + nums[n];
	    }
  
	    for(int i = 0 ; i < nums.length ; i++){
		
		split[i] = nums[i];
		sum1 = sum1 + split[i];
		sum2 = sum2 - nums[i];

		if(sum1 == sum2){
		    yeshno = true;
		}
		
	    }
    
	    return yeshno;
	}	    

	/*
	  Idea for seriesUp, doesn't work

	  public int[] seriesUp(int n) {
	  int[] result = new int[(n * (n + 1)) / 2];
	  int current = 0;
	  int adder = 1;
	  while(current < n){
	  for(int i = 0 ; i < current ; i++){
	  result[i] = adder;
	  adder++;
	  }
	  current++;
	  }
	  return result;
	  }
	*/

    }

    

