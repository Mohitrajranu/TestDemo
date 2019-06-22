package ruleengine.threadTask;

public class ThreadCenter {

	public static void main(String[] args) {

		/*
		ExecutorService executor = Executors.newFixedThreadPool(5); 
resultArray = new JSONArray();
for (Branch branch : Branches) {
    Future<Response> response = executor.submit(new Request(branch.getUrl(), 
      branch.getUserName(), branch.getPassword()));
    responseBody = response.get().getResponseBody();
    resultArray.put(responseBody);
}
executor.shutdown();
while(!executor.isTerminated()) {

}
return resultArray.toString();

Collection<Callable<Request>> tasks = new ArrayList<>();
for (Branch branch : Branches) {
    tasks.add(new Request(branch.getUrl(), branch.getUserName(), branch.getPassword()));
}

int numThreads = Branches.size() > 4 ? 4 : Branches.size();
ExecutorService executor = Executors.newFixedThreadPool(numThreads);
List<Future<Response>> results = executor.invokeAll(tasks);
for(Future<Response> response : results){
    responseBody = response.get().getResponseBody();
    resultArray.put(responseBody);
}
Java 7 onwards we you can try replace ExecutorService with ForkJoin Pool,

Collection<Callable<Request>> tasks = new ArrayList<>();
for (Branch branch : Branches) {
    tasks.add(new Request(branch.getUrl(), branch.getUserName(), branch.getPassword()));
}

int numThreads = Branches.size() > 4 ? 4 : Branches.size();
ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
List<Future<Response>> results = pool.invokeAll(tasks);
for(Future<Response> response : results){
    responseBody = response.get().getResponseBody();
    resultArray.put(responseBody);
}
		
		
		
		*/
	}

}
