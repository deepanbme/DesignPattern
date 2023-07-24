package designPattern.src.main.behaviouralPattern.StrategyPattern;

public class GoogleMap {

    private IPathCalculator iPathCalculator;
    public void getPathForModeOfTransport(String src, String dest,TransportModeEnum mode){
        iPathCalculator = PathCalculatorFactory.getTransportModeFactory(mode);
        iPathCalculator.findPath(src, dest);
    }
}
