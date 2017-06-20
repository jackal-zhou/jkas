public class Bs
{   public Bs()
	{
	}

	public static void main(String[] args)
	{
		    int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};   
            System.out.println(binSearch(srcArray,  81)); 
	}

	public static int binSearch(int srcArray[], int key) {   
            int mid = srcArray.length / 2;   
            if (key == srcArray[mid]) {   
                return mid;   
            }   

            int start = 0;   
            int end = srcArray.length - 1;   
            while (start <= end) {   
                mid = (end - start) / 2 + start;   
                if (key < srcArray[mid]) {   
                   end = mid - 1;   
                } else if (key > srcArray[mid]) {   
                    start = mid + 1;   
                } else {   
                    return mid;   
                }   
            }   
            return -1;   
        } 
}