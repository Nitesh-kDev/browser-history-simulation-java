package org.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class BrowserHistorySimulation {
    private final LinkedList<String> list=new LinkedList<>();
    private final ListIterator<String> listItr=list.listIterator();
    private String currentPage=null;

    public void visitPage(String url){
        while(listItr.hasNext()){
            listItr.next();
            listItr.remove();
        }
        listItr.add(url);
        currentPage=url;
        System.out.println("Visited " + url);
    }
    public void goBack() {
        if (!listItr.hasPrevious()) {
            System.out.println("No previous page exist");
            return;
        }
        listItr.previous();

        if (!listItr.hasPrevious()) {
            listItr.next();
            System.out.println("No previous page exist");
            return;
        }
        currentPage = listItr.previous();
        listItr.next();
        System.out.println("Back to: " + currentPage);
    }
    public void goForward(){
        if(listItr.hasNext()){
            currentPage=listItr.next();
            System.out.println("Forward to: " + currentPage);
        }
        else{
            System.out.println("No forward page exist");
        }
    }
    public void showCurrentPage(){
        if(currentPage==null){
            System.out.println("No page visited yet...");
        }
        else {
            System.out.println("Current page: " + currentPage);
        }
    }
}
