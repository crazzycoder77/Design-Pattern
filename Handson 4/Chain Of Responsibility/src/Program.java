
public class Program {
	public static ILeaveRequestHandler getChainOfILeaveRequestHandlers() {
		ILeaveRequestHandler hr = new HR();
		ILeaveRequestHandler projectManager = new ProjectManager(hr);
		ILeaveRequestHandler supervisor = new Supervisor(projectManager);
		return supervisor;
	}
	
	public static void main(String[] args) {
		LeaveRequest request1 = new LeaveRequest("Mr. Foo", 1);
		LeaveRequest request2 = new LeaveRequest("Mr. Boo", 2);
		LeaveRequest request3 = new LeaveRequest("Mr. Baa", 3);
		LeaveRequest request4 = new LeaveRequest("Mr. Bas", 4);
		LeaveRequest request5 = new LeaveRequest("Mr. Fap", 5);
		LeaveRequest request6 = new LeaveRequest("Mr. Fis", 6);
		ILeaveRequestHandler handler = getChainOfILeaveRequestHandlers();
		handler.handleRequest(request1);
		handler.handleRequest(request2);
		handler.handleRequest(request3);
		handler.handleRequest(request4);
		handler.handleRequest(request5);
		handler.handleRequest(request6);
	}
}
