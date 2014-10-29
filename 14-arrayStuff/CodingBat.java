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
	
	//Not working right now
	public int[] tenRun(int[] nums){
	    for(int i = 0 ; i < nums.length ; i++){
		while( ((nums[i] % 10) == 0) && (i < nums.length) ){
		    int multiple10 = nums[i];
		    i++;
		    while(i < nums.length){
			if( (nums[i] % 10) != 0){
			    nums[i] = multiple10;
			    i++;
			}
			else{
			    break;
			}
		    }
		    i++;
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
		    
		    


    }

    

