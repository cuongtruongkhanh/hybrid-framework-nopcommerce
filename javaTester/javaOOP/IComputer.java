package javaOOP;

public interface IComputer {
	// Nếu không gán từ khóa là abstract cho hàm thì tự hiểu đây vẫn là 1 hàm abstract
	public void showComputerPerformance();

	public abstract void showComputerRam();
}
