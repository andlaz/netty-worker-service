package com.github.andlaz.netty.worker.service.impl;

import io.netty.channel.nio.NioEventLoopGroup;
import aQute.bnd.annotation.component.Component;

import com.github.andlaz.netty.worker.service.api.NettyWorkerService;

@Component(immediate=true)
public class NettyWorkerServiceImpl implements NettyWorkerService {

	private final NioEventLoopGroup workerGroup = new NioEventLoopGroup();
	
	@Override
	public NioEventLoopGroup getWorkerGroup() {
		return workerGroup;
	}

}
