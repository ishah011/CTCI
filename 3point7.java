/* 
* 
3.7
An animal shelter holds only dogs and cats, and operates on a strictly "first in,
first out" basis. People must adopt either the "oldest" (based on arrival time) of
all animals at the shelter, or they can select whether they would prefer a dog or
a cat (and will receive the oldest animal of that type). They cannot select which
specificanimal they would like. Create the data structures to maintain this system
and implement operations such as enqueue, dequeueAny, dequeueDog and
dequeueCat.You may use the built-in LinkedList data structure.
*
*/

//two different queues, one for cats and one for dogs
//when you enqueue, determine the correct animal and enqueue it to the corresponding queue
//when you dequeueDog, take the top of the dog queue, when you dequeueCat, take the top of the cat queue
//when you dequeueAny, compare the timestamps of the tops of both of the queues and dequeue the earlier one

public class Animal
{
	private int time;
	protected String type;
	Animal(String kind)
	{
		type = kind;
	}

	//need getters and setters for private variables
	public static String getTime()
	{
		return time;
	}

	public static void setTime(int newTime)
	{
		time = newTime;
	}

}

public class Shelter
{
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	int timestamp = 0;
	
	public void enqueue(Animal animal)
	{
		animal.setTime(timestamp);
		timestamp++;
		if(animal.type == dog)
		{
			dogs.addLast(animal);
		}
		else
		{
			cats.addLast(animal);
		}
	}

	public Animal dequeueAny()
	{
		if(dogs.size() == 0)
		{
			return dequeueCat();
		}
		else if (cats.size() == 0)
		{
			return dequeueDog();
		}
		else
		{
			if(dogs.peek().getTime < cats.peek().getTime())
				return dequeueDog();
			else
				return dequeueCat();
		}
	}

	public Animal dequeueDog()
	{
		return dogs.removeFirst();
	}

	public Animal dequeueCat()
	{
		return cats.removeFirst();
	}

}

public class Dog extends Animal
{
	public Dog(String type)
	{
		super(type);
	}
}

public class Cat extends Animal
{
	public Cat(String type)
	{
		super(type);
	}
}