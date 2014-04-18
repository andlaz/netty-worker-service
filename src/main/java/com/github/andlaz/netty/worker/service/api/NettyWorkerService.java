package com.github.andlaz.netty.worker.service.api;

import io.netty.channel.nio.NioEventLoopGroup;

public interface NettyWorkerService {

	public NioEventLoopGroup getWorkerGroup();
	
}
