package com.atguigu.ioc;

public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService getInstance() {

        return clientService;
    }
}