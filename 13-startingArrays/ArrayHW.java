public class ArrayHW{

    public int[] frontPiece(int[] nums) {
	int[] first2;
    
	if(nums.length < 2){
	    first2 = new int[nums.length];
	}
	else{
	    first2 = new int[2];
	}
  
	for(int i = 0 ; i < nums.length && i < 2 ; i++) {
	    first2[i] = nums[i];
	}

	return first2;
    }

    public int sum13(int[] nums) {
	int sum = 0;
	int i = 0;

	while(i < nums.length){

	    if(nums[i] == 13){
		i = i + 2;
	    }
	    else{
		sum = sum + nums[i];
		i++;
	    }

	}
	return sum;
    }

}
