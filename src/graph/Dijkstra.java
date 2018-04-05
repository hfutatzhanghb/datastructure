package graph;

//dijkstra算法

public class Dijkstra {
	static int N = Integer.MAX_VALUE;
	public static void main(String[] args) {
		
		int[][] Graph = { { 0, 1, 5, N, N, N, N, N, N }, { 1, 0, 3, 7, 5, N, N, N, N }, { 5, 3, 0, N, 1, 7, N, N, N },
				{ N, 7, N, 0, 2, N, 3, N, N }, { N, 5, 1, 2, 0, 3, 6, 9, N }, { N, N, 7, N, 3, 0, N, 5, N },
				{ N, N, N, 3, 6, N, 0, 2, 7 }, { N, N, N, N, 9, 5, 2, 0, 4 }, { N, N, N, N, N, N, 7, 4, 0 } };
		int[] mindistance = new int[Graph.length];
		dijstra(0, Graph,mindistance);
		for (int  i : mindistance) {
			System.out.println(i);
		}
	}

	static void dijstra(int start, int[][] graph,int[] mindistance) {
		int num = graph.length;
		
		
		boolean[] visited = new boolean[num];
		
		//初始化
		for (int i = 0; i < graph.length; i++) {
			visited[i]=false;
			mindistance[i]=graph[start][i];
		}
		visited[start]=true;
		mindistance[start]=0;
		//用于记录当前最小距离的下标
		int k =0;
		//进行n-1次
		for (int i = 1; i < graph.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < graph.length; j++) {
				if (mindistance[j]<min && !visited[j]) {
					min = mindistance[j];
					k=j;
				}
			}
			
			visited[k] = true;
			
			for (int j = 0; j < graph.length; j++) {
				int temp = graph[k][j] == N ? N: mindistance[k]+graph[k][j];
				if (visited[j]==false && mindistance[j]>temp) {
					mindistance[j] =temp;
				}
			}
			//System.out.println(mindistance[k]);
		}
		
		
	}

}
