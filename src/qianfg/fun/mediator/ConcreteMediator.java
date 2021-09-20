package qianfg.fun.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator {

    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        }
    }

    /**
     * 具体中介者的核心方法
     * 得到消息，完成对应任务
     * 中介者在这个方法中，协调各个具体的同事对象，完成任务
     */
    @Override
    void getMessage(int stateChange, String colleagueName) {
        Colleague colleague = colleagueMap.get(colleagueName);
        if (colleague instanceof Alarm) {
            if (stateChange == 0) {
                ((Alarm) (colleagueMap.get(interMap.get("Alarm")))).startAlarm();
                ((TV) (colleagueMap.get(interMap.get("TV")))).startTV();
            } else {
                ((Alarm) (colleagueMap.get(interMap.get("Alarm")))).stopAlarm();
                ((TV) (colleagueMap.get(interMap.get("TV")))).stopTV();
            }
        } else if (colleague instanceof TV) {
            if (stateChange == 0) {
                ((TV) (colleagueMap.get(interMap.get("TV")))).startTV();
            } else {
                ((TV) (colleagueMap.get(interMap.get("TV")))).stopTV();
            }
        }
    }
}
