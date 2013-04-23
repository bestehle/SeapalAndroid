package en.htwg.seapal.Observer;


public interface IObservable {
	
	void addObserver(IObserver s);
	void removeObserver(IObserver s);
	void removeAllObservers();
	void notifyObservers();
	void notifyObservers(Event e);
	
}
