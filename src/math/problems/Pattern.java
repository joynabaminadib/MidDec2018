package math.problems;



public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
				//Taking rows value from the user
		for (int i = 1; i <= 1; i++)
		{
			for (int j = 100; j >= i; j--)
			{
				System.out.print(j+",");
			}

			System.out.println();
		}

		for (int i=1; i<=1; i++) {
			for (int j=100; j>=i; j--)
			{
				System.out.print(j+",");
			}
			System.out.println();
		}

		System.out.println("*newStyle*");

				for (int i = 1; i <= 100; i++)
				{
					for (int j = 100; j >= i; j--)
					{
						System.out.print(j);
					}

					System.out.println();
				}




			}
		}




