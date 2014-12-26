/**
 * @file JSONEncodeDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/19/2014
 *
 * Greeting representation class with resources.
 */

package service;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {

        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
