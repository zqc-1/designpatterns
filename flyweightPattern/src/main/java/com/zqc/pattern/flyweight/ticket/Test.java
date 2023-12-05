package com.zqc.pattern.flyweight.ticket;

public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京西","上海虹桥");
        ticket.showInfo("硬座");

        ticket = TicketFactory.queryTicket("上海","北京");
        ticket.showInfo("硬座");

        ticket = TicketFactory.queryTicket("上海","北京");
        ticket.showInfo("硬座");
    }
}
