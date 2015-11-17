package ru.lesson.lessons;

import javafx.beans.value.ObservableIntegerValue;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Gamer on 17.11.2015.
 */
public class ClinicTest {

    @Test
    public void testAddClient() throws Exception {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("Brown", new Cat("Diggy")));
        clinic.addClient(1, new Client("Bron", new Dog(new Animal ("Doggy"))));
        assertEquals(3, clinic.AmountofPets());
    }
}