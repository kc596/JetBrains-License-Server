package cn.suimg.ls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.suimg.ls.util.JetBrainsUtil;

@Controller
@RequestMapping("rpc")
public class ActivateController {

    private static final String SIGN_TEMPLATE="<!-- %s -->\n";

    private static final String OBTAIN_TICKET_TEMPLATE=
                    "<ObtainTicketResponse>\n" +
                    "    <message></message>\n" +
                    "    <prolongationPeriod>607875500</prolongationPeriod>\n" +
                    "    <responseCode>OK</responseCode>\n" +
                    "    <salt>%s</salt>\n" +
                    "    <ticketId>1</ticketId>\n" +
                    "    <ticketProperties>licensee=%s\tlicenseType=0\t</ticketProperties>\n" +
                    "</ObtainTicketResponse>";

    private static final String RELEASE_TICKET_TEMPLATE=
                    "<ReleaseTicketResponse>\n" +
                    "    <message></message>\n" +
                    "    <responseCode>OK</responseCode>\n" +
                    "    <salt>%s</salt>\n" +
                    "</ReleaseTicketResponse>";

    private static final String PROLONG_TICKET_TEMPLATE=
                    "<ProlongTicketResponse>\n" +
                    "    <message></message>\n" +
                    "    <responseCode>OK</responseCode>\n" +
                    "    <salt>%s</salt>\n" +
                    "    <ticketId>1</ticketId>\n" +
                    "</ProlongTicketResponse>";

    private static final String PING_TEMPLATE=
                    "<PingResponse>\n" +
                    "    <message></message>\n" +
                    "    <responseCode>OK</responseCode>\n" +
                    "    <salt>%s</salt>\n" +
                    "</PingResponse>";

    @RequestMapping(value="obtainTicket.action",produces={"text/xml; charset=UTF-8"})
    @ResponseBody
    public Object obtainTicket(String salt,String userName){
        //想授权给谁就可以修改后面的字符串。可以为任意字符
        //就是不能有中文!就是不能有中文!就是不能有中文!
        String data = String.format(OBTAIN_TICKET_TEMPLATE,salt,"suimg");
        String sign = String.format(SIGN_TEMPLATE,JetBrainsUtil.sign(data));
        return sign+data;
    }

    @RequestMapping(value="releaseTicket.action",produces={"text/xml; charset=UTF-8"})
    @ResponseBody
    public Object releaseTicket(String salt){
        String data=String.format(RELEASE_TICKET_TEMPLATE,salt);
        String sign = String.format(SIGN_TEMPLATE,JetBrainsUtil.sign(data));
        return sign+data;
    }

    @RequestMapping(value="prolongTicket.action",produces={"text/xml; charset=UTF-8"})
    @ResponseBody
    public Object prolongTicket(String salt){
        String data=String.format(PROLONG_TICKET_TEMPLATE,salt);
        String sign = String.format(SIGN_TEMPLATE,JetBrainsUtil.sign(data));
        return sign+data;
    }

    @RequestMapping(value="ping.action",produces={"text/xml; charset=UTF-8"})
    @ResponseBody
    public Object ping(String salt){
        String data=String.format(PING_TEMPLATE,salt);
        String sign = String.format(SIGN_TEMPLATE,JetBrainsUtil.sign(data));
        return sign+data;
    }

}
