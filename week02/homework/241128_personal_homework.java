package homework;

import java.util.Iterator;

public class Homework {
	public static void main(String[] args) {
// 		1
//	   121
//	  12321
//	 1234321
//	123454321

		// logic
		// 1~5순으로 증가하는 숫자 파트와 5~1순으로 감소하는 숫자 파트를
		// 두 부분으로 나누어 생각하자.
		// 출력되어야하는 행의 수는 동일하지만, 행의 수는 1 적다.
		// 열에 출력되는 숫자값은 1씩 감소해야한다. 0 , 1 , 21 ,321, 4321 54321
//
//		int rows = 5;
//
//		for (int i = 1; i <= rows; i++) { 					// 전체 행 출력을 위한 반복문
//
//			for (int j = 1; j <= rows - i; j++) { 			// 왼쪽 공백 출력을 위한 반복문
//				System.out.print(" "); 						// 공백 출력
//			}
//
//			for (int j = 1; j <= i; j++) { 					// 왼쪽 숫자 출력을 위한 반복문
//				System.out.print(j); 						// 왼쪽 숫자 출력
//			}
//
//			for (int j = i - 1; j >= 1; j--) { 				// 오른쪽 숫자 출력을 위한 반복문
//															// 가장 마지막에 출력되야하는 열의 숫자는 1이 되야하기 때문에 최소 값은 1
//				System.out.print(j); 						// 오른쪽 숫자 출력
//			}
//			System.out.println(); 							// 줄넘김
//		}
		
		
		  	// review
        
    		// 특별히 없음. 비교적 무난하게 풀 수 있었다.
    	
		
		
		
		
	
		// 1 2 3 4
		// 12 13 14 5
		// 11 16 15 6
		// 10 9 8 7

		// logic
		// 2dim matrix를 안쓰고 출력할 것..

		// 4*4의 matrix의 형태이고
		// 나선형으로 시계방향으로 회전하면서 숫자가 증가한다.
		// 구조를 겉을 감싸는 층과 안쪽을 구성하는 층 2개로 구분하여 생각한다.
		// layer 0은 1,2,3,5,6,7,8,9,10,11,12 로 채워지고
		// layer 1은 13,14,15,16 로 채워진다.
		
		// 출력되는 숫자는 좌표로 판단
		// 현재 출력되는 부분이 어느 레이어에 있는지 판단이 필요하다.
		// 숫자가 진행하다가 경계를 만나면 꺾이기 때문에, 경계를 설정해야한다.
		// 나선형 패턴을 그리기 위해
		// 정방향 (좌->우, 위 -> 아래)로 출력될 때는 보정값이 필요없지만
		// 역방향 (우<-좌. 아래 -> 위)로 출력될때는 보정값이 필요하다.
		
		
		
		
		
				int matrixSize = 4; 								// 행렬의 크기 (4x4)

				int leftBoarder = 0;								// 왼쪽 경계
				int rightBoarder = 0;								// 오른쪽 경계
				int topBoarder = 0;									// 위쪽 경계
				int bottomBoarder = 0;								// 아래쪽 경계
		        int value; 											// 출력되는 실제 숫자값을 계산하여 저장 

				int layer = 0;										// 현재 어느 층에 있는지 값을 저장

		       

		        for (int row = 0; row < matrixSize; row++) {  		// 행을 순차적으로 반복하여 숫자들을 출력 (y축)
		        	
		            for (int col = 0; col < matrixSize; col++) { 	// 열을 순차적으로 반복하여 숫자를 출력(x축)  
		            	
		                											// 현재 위치 (row, col)에 대한 나선의 깊이를 계산
		            	
		                 leftBoarder = col; 							// 오른쪽 경계, 오른쪽 방향으로 이동할 때, rightBoarder가 0이 되면 다음 방향(아래쪽)으로 꺾여야 함
		                 rightBoarder = matrixSize - col - 1; 			// 오른쪽 경계
		                 topBoarder = row; 								// 현재 행
		                 bottomBoarder = matrixSize - row - 1; 			// 아래쪽 경계, 아래쪽 방향으로 이동할 때, bottomBoarder가 0이 되면 다음 방향(오른쪽)으로 꺾여야 함
		                
//		         		left 경계값을 첫 번째 기본값으로 설정
//		         		나선형 배열이 왼쪽에서 오른쪽으로 진행되기 때문에
//		         		첫 번째 좌측 경계leftBoarder에서부터 출발.							
		                layer = leftBoarder;
		                
		                if (rightBoarder < layer) layer = rightBoarder; //우측 경계와 현재 layer를 비교해서 rightBoarder가 더 작은 값이면, layer에 rightBoarder 값이 저장
		                if (topBoarder < layer) layer = topBoarder;  //상단 경계와 현재 layer를 비교해서 topBoarder가 더 작은 값이면, layer에 topBoarder 값이 저장
		                if (bottomBoarder < layer) layer = bottomBoarder; //하단 경계와 현재 layer를 비교해서 bottomBoarder가 더 작은 값이면, layer에 bottomBoarder 값이 저장

		                // 반복문으로 나선형 패턴을 그리기
		                
		                if (col >= row) { 							// 만약 열이 행보다 크거나 같다면....
		                	
		                    value = col + row - 2 * layer;			// col과 row가 같은 방향으로 진행될 때의 계산식
		                    										// 채워가는 진행 방향에 따라 값이 증가하는 경우에 사용(왼쪽에서 오른쪽, 위에서 아래)
		                    										// col + row는 현재 위치의 증가값을 계산
		                    										// -2 * layer는 각 레이어에 따른 위치 보정
		                    										// row = 0, col =2 , layer=0일때, 결과는 3 (1부터 시작하니까 value에 +1)
																	// row =1, col =1 , layer= 1일때, 결과는 13 (안쪽 layer1의 0 , 보정값 추가시 13)

		                    										
		                } else {
		                    																	// 반대 방향으로 진행될 때의 계산
		                    value = (matrixSize - 1 - 2 * layer) * 4 - (col + row - 2 * layer);
		                }		
		                																		// col과 row가 반대 방향으로 진행될 때의 계산
		                    																	//현재 위치가 layer의 마지막 지점에 가까워졌을 때 해당 위치의 값
		                    																	// layer의 끝값을 기준으로 반대방향으로 감소
		               																		                    																	// matrixSize−1−2×layer 현재 layer 한변의 길이를 계산	
																								// layer0일때 한변의 길이 = matrixSize-1-2*0 = 3
																								// layer1일때 한변의 길이 = matrixSize-1-2*1 = 1
		                
																								// *4 = 현재 layer에서 한바퀴를 도는데 필요한 값의 개수
																								//	layer 0일때 3 * 4 = 12 (4방향의 합)
																								//  layer 1 일때 1 * 4 = 4 (중앙 작은 4개 값)

																								// - (col + row - 2 * layer)
																								// 현재 위치에서 시작점으로부터의 거리..
																								// 빼는 이유.. 반대방향으로 값을 감소시키기 위해
		                
		                
		                
		                																		// 나선형의 layer에 따른 연산식
		                value += 4 * (layer * matrixSize - (layer * layer)); 					// 각 layer에 해당하는 보정값을 추가하는 식
		            																			//1 ~ 12, layer0는 보정 값이 0
																								// 13~16, layer1부터는 계산식에 따라 +12값의 보정값이 더해져서 출력
																								
		                																		// 4 * 좌우상하 네 방향으로 값이 증가
		                
																								// layer * matrixSize 각 레이어의 시작지점
		                																		// layer0 일때 0
		                																		// layer1 일때 12
		                
		                																		// layer * layer 빠져야할 숫자를 보정하는 부분

		                
		                																		// 계산된 값 출력 (1부터 시작)
		                System.out.printf("%3d", value + 1); 									// 이 value 값이 실제 출력되는 숫자값
		            }
		            System.out.println();														// 줄넘김
		        }   
        	
		        
		    // review
        
        	// 2dimention matrix를 쓰면 쉽게 풀 수 있었을지도 모르지만 최대한 수업 진도 범위 안에서 풀어야했기에 많은 어려움을 겪었다.
        	// 기본 반복문과 연산만으로 출력하기 매우 어려웠다.
        	// 출력되는 부분의 행 열을 기준으로 좌표 설정을 해서 차례로 출력한다는 개념은 쉽게 떠올릴 수 있었지만,
        	// layer 개념과 보정값이 필요하다는 것을 떠올리는것에 상당히 오랜 시간이 걸렸고.
        	// 보정값을 value 에 값을 저장하기 위한 연산식 수립에도 많은 시간이 걸렸다.
 
		        
	}
}
